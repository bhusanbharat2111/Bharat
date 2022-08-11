package training.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.zip.GZIPOutputStream;

public class GzipFile {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferr1 = null;
		try {
			File f1 = new File("files(filehandling)\\TextFile2.txt");
			File f2 = new File("files(filehandling)\\copy1.txt");
			File f3 = new File("files(filehandling)\\copy2.txt");

			/**
			 * Using .copy() to copy one file to another via a specified path.
			 */
			Files.copy(f1.toPath(), f2.toPath());

			bufferr1 = new BufferedReader(new FileReader("files(filehandling)\\copy1.txt"));

			String Details = null;
			while ((Details = bufferr1.readLine()) != null) {
				System.out.println(Details);
			}
			/**
			 * Converts given file path to object.
			 */
			Path source = Paths.get("files(filehandling)\\copy1.txt");
			Path target = Paths.get("files(filehandling)\\copy1.txt.gz");

			/**
			 * Using .notExists() to check the existence of the given file.
			 */
			if (Files.notExists(source)) {
				System.out.println("Invalid Path provided!!!");
				return;
			}
			/**
			 * Using Custom method(compressGzip(source, target);) to pass the path of the
			 * files.
			 */
			GzipFile.compressGzip(source, target);

			/**
			 * Using .delete() to delete the given file.
			 */
			if (f1.delete()) {
				System.out.println(f1.getName() + "    File deleted Successfully!!");

			} else {
				System.out.println("Failed to delete the file!!");
			}

			/**
			 * Using SimpleDateFormat class to use .format() to get the value returned by
			 * .lastModified() in the specified format.
			 */
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			System.out.println("Last Modified Date: " + sdf.format(f2.lastModified()));

			/**
			 * Using .setReadOnly() to restrict the Write operations for the specified file.
			 */
			boolean access = f2.setReadOnly();
			if (access == true) {
				System.out.println("Converted file to ReadOnly Successfully!!!");
			} else {
				System.out.println("Failed to convert!!!!");
			}

			/**
			 * Using the .isHidden() to check if the file is Hidden or not.
			 */
			if (f3.isHidden()) {
				System.out.println("The specified file is hidden");
			} else {
				System.out.println("The specified file is not hidden");
			}
		} catch (Exception e) {
			System.out.println("Invalid Input!!");
		} finally {
			bufferr1.close();
		}
	}

	/**
	 * Writing the method definition of the custom method(compressGzip)
	 */
	private static void compressGzip(Path source, Path target) throws IOException {

		try (GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream(target.toFile()));
				FileInputStream fis = new FileInputStream(source.toFile())) {
			byte[] buffer = new byte[1024];
			int len;
			while ((len = fis.read(buffer)) > 0) {
				gos.write(buffer, 0, len);
			}
		}
		System.out.println("File Compressed successfully!!! ");

	}
}
