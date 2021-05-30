package com.advait.instagram_clone_improved.Messages.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAdj1u2Zc:APA91bEeJOv9-5xJzw7iPfxxVTRrTY9gDNoLKerh6dJPvXhADqE6iClizUHhL6arcCv2U2bRdfQukPFo_oXXu9wBgnJb9WCIHAMDgnWkS26ueGiBU9uRI7Jwyx8iBU2AzdiTMoJI2kRY"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);


}
