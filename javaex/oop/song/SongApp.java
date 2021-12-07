package com.javaex.oop.song;

public class SongApp {

	public static void main(String[] args) {
		Song song1 = new Song("좋은 날", "아이유");

		// Song(title, artist); Song(title, artist, album); => 코드 중복
		// 이미 만들어진 필수필드 생성자를 호출하고 부가 필드에 관련된 생성자를 호출해준다.
		
		
		
		song1.setTitle("좋은날");
		song1.setArtist("아이유");
		song1.setAlbum("Real");
		song1.setComposer("이민수");
		song1.setYear(2010);
		song1.setTrack(3);
		song1.showInfo();
		
		Song song2 = new Song("거짓말", "빅뱅");

		song1.setTitle("거짓말");
		song1.setArtist("빅뱅");
		song1.setAlbum("Always");
		song1.setComposer("G-DRAGON");
		song1.setYear(2007);
		song1.setTrack(2);
		song1.showInfo();
		
		Song song3 = new Song("벚꽃엔딩", "버스커버스커");

		song1.setTitle("벚꽃엔딩");
		song1.setArtist("버스커버스커");
		song1.setAlbum("버스커버스커1집");
		song1.setComposer("장범준");
		song1.setYear(2012);
		song1.setTrack(4);
		song1.showInfo();
	}

}
