package com.elitesbd.mydss;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.veinhorn.scrollgalleryview.MediaInfo;
import com.veinhorn.scrollgalleryview.ScrollGalleryView;
import com.veinhorn.scrollgalleryview.loader.DefaultImageLoader;

import static android.graphics.Color.WHITE;

public class ActivityPhotoGallery extends AppCompatActivity {
    /*

    private static final ArrayList<String> images = new ArrayList<>(Arrays.asList(
            R.mipmap.mydss_images00,
            "http://img1.goodfon.ru/original/1920x1080/d/f5/aircraft-jet-su-47-berkut.jpg",
            "http://www.dishmodels.ru/picture/glr/13/13312/g13312_7657277.jpg",
            "http://img2.goodfon.ru/original/1920x1080/b/c9/su-47-berkut-c-37-firkin.jpg"
    ));

    */
    private ScrollGalleryView scrollGalleryView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_gallery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        //change name of title
        ((AppCompatActivity) ActivityPhotoGallery.this).getSupportActionBar().setTitle("ফটো গ্যালারী");




        //
        scrollGalleryView = (ScrollGalleryView) findViewById(R.id.scroll_gallery_view);
        scrollGalleryView


                .setThumbnailSize(100)
                .setZoom(true)
                .setFragmentManager(getSupportFragmentManager())
                .addMedia(MediaInfo.mediaLoader(new DefaultImageLoader(R.mipmap.mydss_images00)))
                .addMedia(MediaInfo.mediaLoader(new DefaultImageLoader(R.mipmap.mydss_images01)))
                .addMedia(MediaInfo.mediaLoader(new DefaultImageLoader(R.mipmap.mydss_images02)))
                .addMedia(MediaInfo.mediaLoader(new DefaultImageLoader(R.mipmap.mydss_images04)))
                .addMedia(MediaInfo.mediaLoader(new DefaultImageLoader(R.mipmap.mydss_images05)))
                .addMedia(MediaInfo.mediaLoader(new DefaultImageLoader(R.mipmap.mydss_images06)))
                .addMedia(MediaInfo.mediaLoader(new DefaultImageLoader(R.mipmap.mydss_images07)))
                .addMedia(MediaInfo.mediaLoader(new DefaultImageLoader(R.mipmap.mydss_images09)))
                .setBackgroundColor(WHITE)

        ;
        /*

                .addMedia(MediaInfo.mediaLoader(new DefaultImageLoader(toBitmap(R.mipmap.mydss_images01))))
                .addMedia(MediaInfo.mediaLoader(new MediaLoader() {
                    @Override public boolean isImage() {
                        return true;
                    }

                    @Override public void loadMedia(Context context, ImageView imageView,
                                                    MediaLoader.SuccessCallback callback) {
                        imageView.setImageBitmap(toBitmap(R.mipmap.mydss_images02));
                        callback.onSuccess();
                    }

                    @Override public void loadThumbnail(Context context, ImageView thumbnailView,
                                                        MediaLoader.SuccessCallback callback) {
                        thumbnailView.setImageBitmap(toBitmap(R.mipmap.mydss_images03));
                        callback.onSuccess();
                    }
                }));
                */
               // .addMedia(MediaInfo.mediaLoader(new DefaultVideoLoader(movieUrl, R.mipmap.default_video)))
               // .addMedia(infos);









    }

    private Bitmap toBitmap(int image) {
        return ((BitmapDrawable) getResources().getDrawable(image)).getBitmap();
    }
    //for back button in toolbar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

}
