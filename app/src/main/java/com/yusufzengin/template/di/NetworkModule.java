package com.yusufzengin.template.di;

import com.yusufzengin.template.di.scopes.ApplicationScope;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public abstract class NetworkModule {

    private static final int CONNECTION_TIMEOUT = 10;
    private static final int READ_TIMEOUT = 10;
    private static final int WRITE_TIMEOUT = 10;

    @Provides
    @ApplicationScope
    static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    @Provides
    @ApplicationScope
    static OkHttpClient provideOkHttpClient(HttpLoggingInterceptor loggingInterceptor) {

        return new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
                .build();
    }

    @Provides
    @ApplicationScope
    static GsonConverterFactory provideGsonConverterFactory() {
        return GsonConverterFactory.create();
    }

    @Provides
    @ApplicationScope
    static Retrofit provideRetrofit(OkHttpClient client, GsonConverterFactory converter) {
        return new Retrofit.Builder()
                .baseUrl("") // TODO
                .client(client)
                .addConverterFactory(converter)
                .build();
    }
}
