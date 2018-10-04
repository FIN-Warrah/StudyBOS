package studybos.com.studybos;

/**
 * Created by 机械革命 on 2018/8/19.
 */

public class LiveCard {

    private String title;
    private String liverid;
    private String subject;
    private int audienceNumber;
    private int imageId;
    private int liverHeadImageId;

    public LiveCard(String title,String liverid,String subject,int audienceNumber,int imageId,int liverHeadImageId){
        this.title=title;
        this.liverid=liverid;
        this.audienceNumber=audienceNumber;
        this.subject=subject;
        this.imageId=imageId;
        this.liverHeadImageId=liverHeadImageId;
    }

    public String getTitle() {
        return title;
    }

    public String getLiverid() {
        return liverid;
    }

    public String getSubject() {
        return subject;
    }

    public int getAudienceNumber() {
        return audienceNumber;
    }

    public int getImageId() {
        return imageId;
    }

    public int getLiverHeadImageId() {
        return liverHeadImageId;
    }
}
