import java.util.LinkedList;

class MusicPlaylistRecommendationEngine {
    LinkedList<String> playlist = new LinkedList<>();

    void playSong(String song) {
        playlist.addFirst(song);

        if (playlist.size() > 10) {
            playlist.removeLast();
        }

        System.out.println(song + " Played");
    }

    void searchSong(String song) {
        if (playlist.contains(song))
            System.out.println("Song Found");
        else
            System.out.println("Song Not Found");
    }

    void displayPlaylist() {
        System.out.println("Recently Played Songs:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }

    public static void main(String[] args) {
        MusicPlaylistRecommendationEngine obj = new MusicPlaylistRecommendationEngine();

        obj.playSong("Believer");
        obj.playSong("Shape of You");
        obj.playSong("Perfect");
        obj.playSong("Closer");
        obj.playSong("Senorita");
        obj.playSong("Levitating");
        obj.playSong("Faded");
        obj.playSong("Memories");
        obj.playSong("Hymn for the Weekend");
        obj.playSong("Blinding Lights");
        obj.playSong("Peaches");

        obj.searchSong("Closer");
        obj.searchSong("Believer");

        obj.displayPlaylist();
    }
}
