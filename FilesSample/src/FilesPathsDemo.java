import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FilesPathsDemo {
	public static void createFile() throws IOException {
//      Set<PosixFilePermission> perms = new HashSet<>();

//      perms.add(PosixFilePermission.OWNER_READ);
//      perms.add(PosixFilePermission.OWNER_WRITE);
//      perms.add(PosixFilePermission.GROUP_READ);
//      perms.add(PosixFilePermission.GROUP_WRITE);
//      perms.add(PosixFilePermission.OTHERS_READ);

//      FileAttribute<Set<PosixFilePermission>> attrs = PosixFilePermissions.asFileAttribute(perms);

      Path myPath = Paths.get("src/resources/myfile.txt");

      if (Files.exists(myPath)) {
          
          System.out.println("File already exists");
      } else {
          
//          Files.createFile(myPath, attrs);
		Files.createFile(myPath);
	    System.out.println("File created");
      }
	}
	public static void fileSize() throws IOException {
		Path mypath = Paths.get("src/resources/myfile.txt");
		System.out.println("myfile.txt size is "+Files.size(mypath));
	}
	public static void copyFile() throws IOException {
		Path source = Paths.get("src/resources/myfile.txt");
		Path dest = Paths.get("src/resources/myfile1.txt");
		
		Files.copy(source.toAbsolutePath(), dest.toAbsolutePath(), 
				StandardCopyOption.REPLACE_EXISTING);
	}
	public static void deleteFile() throws IOException {
		Path myPath = Paths.get("src/resources/myfile1.txt");
		boolean deleted = Files.deleteIfExists(myPath);
		String result = deleted ? "File deleted" : "File doesn't exist";
		System.out.println(result);
	}
	public static void moveFile() throws IOException {
		Path source = Paths.get("src/resources/myfile1.txt");
		Path dest = Paths.get("src/resources/myfile2.txt");
		
		Files.move(source, dest);
	}
	public static void readFile() throws IOException {
		Path myPath = Paths.get("src/resources/myfile.txt");
		List<String> lines = Files.readAllLines(myPath,StandardCharsets.UTF_8);
		lines.forEach(line->System.out.println(line));
	}
	public static void writeFile() throws IOException {
		Path myPath = Paths.get("src/resources/myfile3.txt");
		List<String> lines = new ArrayList<String>();
		lines.add("Etiam sit amet congue elit. Sed tempus urna vel diam ultrices pulvinar. Suspendisse tristique blandit faucibus. Cras tristique erat a euismod imperdiet. Proin venenatis ultrices neque. Maecenas pretium molestie magna in scelerisque. Etiam luctus dignissim ultricies. Nunc non eleifend nisl, euismod tincidunt velit. In sit amet enim posuere, feugiat leo vel, gravida neque. Quisque pretium pulvinar pharetra. Nullam fermentum mi ipsum, at bibendum nulla fermentum sit amet. Nulla facilisi.\r\n");
		lines.add("Phasellus dui neque, accumsan et urna non, feugiat fringilla dui. In aliquam nisi urna, ut laoreet nisi tincidunt a. Nulla quis eleifend velit. In diam nibh, feugiat quis malesuada eu, condimentum sit amet felis. In imperdiet eleifend metus, eu iaculis ligula tempor at. Maecenas eget feugiat nulla, ut congue odio. Maecenas lobortis pretium quam, a mollis nunc volutpat eu. Aliquam eu pretium lectus. Donec fringilla facilisis libero ac porttitor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean in libero fringilla, finibus nulla eget, varius felis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce varius fermentum mi ut volutpat. Integer maximus elit vehicula, iaculis libero ut, vulputate turpis. In sed purus sit amet lorem mollis lobortis.");
		
		Files.write(myPath, lines, StandardCharsets.UTF_8,StandardOpenOption.CREATE);
	}
}
