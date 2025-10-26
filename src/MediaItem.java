// ====================== CLASS MEDIAITEM ======================
/**
 * Kelas dasar untuk semua item media (misal: lagu, podcast).
 */
public class MediaItem {
    private String title;

    /**
     * Membuat instance MediaItem baru.
     * @param title Judul dari item media.
     */
    public MediaItem(String title) {
        this.title = title;
    }

    /**
     * Mendapatkan judul item media.
     * @return String judul.
     */
    public String getTitle() {
        return title;
    }
}
