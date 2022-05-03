public class VideoMediaPlayer  implements AdvancedMediaPlayer{

    @Override
    public void reproduzirVlc(TipoMedia tipoMedia, String nome) {
        System.out.println("Reproduzindo VLC: " + nome);
    }

    @Override
    public void reproduzirMp4(String nome) {
        System.out.println("Reproduzindo MP4: " + nome);

    }
}
