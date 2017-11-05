package com.zhaiyz.servicebestpractice;

/**
 * Created by zhaiyz on 17-10-10.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
