// ====================== CLASS MAIN ======================
/**
 * Kelas utama untuk menjalankan aplikasi Playlist Manager.
 */
class Main {
    /**
     * Titik awal eksekusi program.
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        PlaylistInfo info = new PlaylistInfo("Chill Vibes", "Adi");

        Track[] songs = {
                new Track("Song A", "Artist 1"),
                new Track("Song B", "Artist 2"),
                new Track("Song C", "Artist 3")
        };

        PlaylistManager manager = new PlaylistManager(info, songs);
        manager.addTrack(new Track("Song D", "Artist 4"));
        manager.displayPlaylistInfo();


    }
}