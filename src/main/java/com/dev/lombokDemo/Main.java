package com.dev.lombokDemo;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.Synchronized;

public class Main {
	@Synchronized
	public static void main(String[] args) {

		Main main = new Main();
		try {
			User user = new User();
			// user.setId(null);
			user.setPsncode("E010101");
			user.setPsnname("dev");
			System.out.println(user);

			Book book = new Book();
			book.setName("Helle");
			book.setPrice(45);
			System.out.println(book);

			main.doing();

			main.io("hi".getBytes());
		} catch (Exception e) {
			System.out.println("异常：" + e);
		}

	}

	@Synchronized
	void doing() {
		System.out.println("do something ...");
	}

	@SneakyThrows(Exception.class)
	public void io(byte[] bytes) {
		@Cleanup
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		outputStream.write(bytes);
		System.out.println(outputStream.toString());
	}
}
