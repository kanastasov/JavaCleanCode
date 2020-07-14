package com.kirilanastasov.isp.mediaPlayer;

public class WinampMediaPlayer implements VideoPlayer,AudioPlayer {

	@Override
	public void playAudio() {
		System.out.println("Play audio");
		
	}

	@Override
	public void playVideo() {
		System.out.println("Can not play video in winamp media player");
	}

}
