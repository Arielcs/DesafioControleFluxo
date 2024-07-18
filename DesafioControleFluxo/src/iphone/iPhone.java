package iphone;

import iphone.interfaces.InternetBrowser;
import iphone.interfaces.MusicPlayer;
import iphone.interfaces.Phone;

public class iPhone implements MusicPlayer, Phone, InternetBrowser {
    private CellularAntenna antenna;

    // Construtor
    public iPhone() {
        this.antenna = new CellularAntenna();
    }

    // Métodos da interface MusicPlayer
    @Override
    public void play() {
        System.out.println("Playing music...");
        // Implementação da reprodução de música
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
        // Implementação de pausa da música
    }

    @Override
    public void stop() {
        System.out.println("Stopping music...");
        // Implementação de parada da música
    }

    // Métodos da interface Phone
    @Override
    public void call(String number) {
        antenna.dialNumber(number);
        // Implementação da chamada telefônica
    }

    @Override
    public void answer() {
        System.out.println("Answering call...");
        // Implementação de atender chamada
    }

    @Override
    public void decline() {
        System.out.println("Declining call...");
        // Implementação de recusar chamada
    }

    // Métodos da interface InternetBrowser
    @Override
    public void openURL(String url) {
        System.out.println("Opening URL: " + url);
        // Implementação de abrir URL no navegador
    }

    // Método específico da classe iPhone
    public void makeCall(String number) {
        call(number);
    }

    // Método específico da classe iPhone
    public void browseInternet(String url) {
        openURL(url);
    }

    // Método específico da classe iPhone
    public void playMusic() {
        play();
    }
}
