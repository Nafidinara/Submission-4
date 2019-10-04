package com.nafidinara.threesubmission.db;

import android.provider.BaseColumns;

public class MovieDbContract {

    public static final class MovieColumns implements BaseColumns{
        public static final  String TABLE_MOVIE_NAME = "movie";

        public static final String ID = "id";
        public static final String TITLE = "title";
        public static final String OVERVIEW = "overview";
        public static final String RELEASE_DATE= "release_date";
        public static final String VOTE_AVERAGE = "vote_average";
        public static final String VOTE_COUNT = "vote_count";
        public static final String ORIGINAL_LANGUANGE = "original_language";
        public static final String POSTER_PATH = "poster_path";
        public static final String BACKDROP_PATH = "backdrop_path";
    }
}
