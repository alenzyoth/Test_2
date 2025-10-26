
// ====================== CLASS PLAYLISTMANAGER ======================
/**
 * Mengelola operasi untuk sebuah playlist, seperti menampilkan lagu.
 */
class PlaylistManager {
    private PlaylistInfo playlistInfo;
    private Track[] tracks;
    private int totalTracks;
    private static final int MAX_SONGS_ALLOWED = 100;

    /**
     * Membuat instance PlaylistManager baru.
     * @param playlistInfo Objek Info playlist.
     * @param tracks Array dari lagu-lagu awal.
     */
    public PlaylistManager(PlaylistInfo playlistInfo, Track[] tracks) {
        this.playlistInfo = playlistInfo;
        this.tracks = tracks;
        this.totalTracks = tracks.length;
    }

    /**
     * Method internal untuk menampilkan header playlist.
     */
    private void displayHeader() {
        System.out.println("Playlist Name: " + playlistInfo.getName());
        System.out.println("Owner: " + playlistInfo.getOwner());
    }

    /**
     * Menampilkan semua informasi playlist, termasuk header dan daftar lagu.
     */
    public void displayPlaylistInfo() {
        displayHeader();
        for (int i = 0; i < totalTracks; i++) {
            System.out.println((i + 1) + ". " + tracks[i].getTitle() + " - " + tracks[i].getArtist());
        }
        System.out.println("Total songs: " + totalTracks);
        System.out.println("Max songs allowed: " + MAX_SONGS_ALLOWED);
        }

    // 🆕 Method sederhana untuk menambah lagu baru ke playlist
    public void addTrack(Track newTrack) {
        if (totalTracks < MAX_SONGS_ALLOWED) {
            // buat array baru dengan ukuran +1
            Track[] updatedTracks = new Track[totalTracks + 1];
            for (int i = 0; i < totalTracks; i++) {
                updatedTracks[i] = tracks[i];
            }
            updatedTracks[totalTracks] = newTrack;
            tracks = updatedTracks;
            totalTracks++;
            System.out.println("✅ Lagu \"" + newTrack.getTitle() + "\" berhasil ditambahkan!");
        } else {
            System.out.println("❌ Tidak dapat menambah lagu. Playlist sudah penuh!");
        }
    }
}
