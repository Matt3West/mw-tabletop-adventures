package utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class IOHelper {
	
	public static String readFileToString(String path) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, StandardCharsets.UTF_8);
	}
	
	public static void saveFileFromString(String path, String contents, Boolean overwrite){
		try {
			Files.createFile(Paths.get(path));
			byte[] bytes = contents.getBytes();
			Files.write(Paths.get(path), bytes);
		} catch (FileAlreadyExistsException e) {
			if(overwrite){
				overwriteFileFromString(path, contents);
			} else {
				System.out.println("File with that name already exists and overwrite specified undesirable.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Path overwriteFileFromString(String path, String contents) {
		Path temp_file_path = null;
		Path new_file_path = null;
		String dir = path.substring(0, path.lastIndexOf("/"));
		try {
			temp_file_path = Files.createTempFile(Paths.get(dir), "temp_", "_old");
			byte[] old_contents = Files.readAllBytes(Paths.get(path));
			Files.write(temp_file_path, old_contents);
			Files.delete(Paths.get(path));
			new_file_path = Files.createFile(Paths.get(path));
			Files.write(new_file_path, contents.getBytes());
			Files.delete(temp_file_path);
		} catch (IOException e) {
			System.out.println("Could not overwrite file.");
			e.printStackTrace();
		}
		return new_file_path;
	}

	public static String[] getFilesOfType(String dir, String ext) {
		ArrayList<String> filesList = new ArrayList<String>();
		try {
			Stream<Path> fileStream = Files.list(Paths.get(dir));
			Object[] fileArray = fileStream.toArray();
			fileStream.close();
			for(int i = 0; i < fileArray.length; i++){
				if (fileArray[i].toString().endsWith(ext)){
					filesList.add(fileArray[i].toString());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] files = new String[filesList.size()];
		for(int i = 0; i < filesList.size(); i++) {
			files[i] = filesList.get(i);
		}
		return files;
	}

}
