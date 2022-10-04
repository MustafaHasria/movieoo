package com.newhorizon.movieoo.view.main;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ShowMoviesResponse {

    //region Properties
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("genres")
    @Expose
    private List<String> genres = null;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("runtime")
    @Expose
    private int runtime;
    private int averageRuntime;
    @SerializedName("premiered")
    @Expose
    private String premiered;
    @SerializedName("ended")
    @Expose
    private String ended;
    @SerializedName("officialSite")
    @Expose
    private String officialSite;
    @SerializedName("schedule")
    @Expose
    private Schedule schedule;
    @SerializedName("rating")
    @Expose
    private Rating rating;
    @SerializedName("weight")
    @Expose
    private int weight;
    @SerializedName("network")
    @Expose
    private Network network;
    @SerializedName("webChannel")
    @Expose
    private Object webChannel;
    @SerializedName("dvdCountry")
    @Expose
    private Object dvdCountry;
    @SerializedName("externals")
    @Expose
    private Externals externals;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("updated")
    @Expose
    private int updated;
    @SerializedName("_links")
    @Expose
    private Links links;
    //endregion

    //region Constructor
    public ShowMoviesResponse() {
    }

    public ShowMoviesResponse(int id, String url, String name, String type, String language, List<String> genres, String status, int runtime, int averageRuntime, String premiered, String ended, String officialSite, Schedule schedule, Rating rating, int weight, Network network, Object webChannel, Object dvdCountry, Externals externals, Image image, String summary, int updated, Links links) {
        super();
        this.id = id;
        this.url = url;
        this.name = name;
        this.type = type;
        this.language = language;
        this.genres = genres;
        this.status = status;
        this.runtime = runtime;
        this.averageRuntime = averageRuntime;
        this.premiered = premiered;
        this.ended = ended;
        this.officialSite = officialSite;
        this.schedule = schedule;
        this.rating = rating;
        this.weight = weight;
        this.network = network;
        this.webChannel = webChannel;
        this.dvdCountry = dvdCountry;
        this.externals = externals;
        this.image = image;
        this.summary = summary;
        this.updated = updated;
        this.links = links;
    }
    //endregion

    //region Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getAverageRuntime() {
        return averageRuntime;
    }

    public void setAverageRuntime(int averageRuntime) {
        this.averageRuntime = averageRuntime;
    }

    public String getPremiered() {
        return premiered;
    }

    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }

    public String getEnded() {
        return ended;
    }

    public void setEnded(String ended) {
        this.ended = ended;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Object getWebChannel() {
        return webChannel;
    }

    public void setWebChannel(Object webChannel) {
        this.webChannel = webChannel;
    }

    public Object getDvdCountry() {
        return dvdCountry;
    }

    public void setDvdCountry(Object dvdCountry) {
        this.dvdCountry = dvdCountry;
    }

    public Externals getExternals() {
        return externals;
    }

    public void setExternals(Externals externals) {
        this.externals = externals;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
    //endregion

    //region Inner classes

    public class Country {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("timezone")
        @Expose
        private String timezone;

        /**
         * No args constructor for use in serialization
         */
        public Country() {
        }

        /**
         * @param code
         * @param timezone
         * @param name
         */
        public Country(String name, String code, String timezone) {
            super();
            this.name = name;
            this.code = code;
            this.timezone = timezone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

    }

    public class Externals {

        @SerializedName("tvrage")
        @Expose
        private int tvrage;
        @SerializedName("thetvdb")
        @Expose
        private int thetvdb;
        @SerializedName("imdb")
        @Expose
        private String imdb;

        /**
         * No args constructor for use in serialization
         */
        public Externals() {
        }

        /**
         * @param thetvdb
         * @param imdb
         * @param tvrage
         */
        public Externals(int tvrage, int thetvdb, String imdb) {
            super();
            this.tvrage = tvrage;
            this.thetvdb = thetvdb;
            this.imdb = imdb;
        }

        public int getTvrage() {
            return tvrage;
        }

        public void setTvrage(int tvrage) {
            this.tvrage = tvrage;
        }

        public int getThetvdb() {
            return thetvdb;
        }

        public void setThetvdb(int thetvdb) {
            this.thetvdb = thetvdb;
        }

        public String getImdb() {
            return imdb;
        }

        public void setImdb(String imdb) {
            this.imdb = imdb;
        }

    }

    public class Image {

        @SerializedName("medium")
        @Expose
        private String medium;
        @SerializedName("original")
        @Expose
        private String original;

        /**
         * No args constructor for use in serialization
         */
        public Image() {
        }

        /**
         * @param original
         * @param medium
         */
        public Image(String medium, String original) {
            super();
            this.medium = medium;
            this.original = original;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getOriginal() {
            return original;
        }

        public void setOriginal(String original) {
            this.original = original;
        }

    }

    public class Links {

        @SerializedName("self")
        @Expose
        private Self self;
        @SerializedName("previousepisode")
        @Expose
        private Previousepisode previousepisode;

        /**
         * No args constructor for use in serialization
         */
        public Links() {
        }

        /**
         * @param self
         * @param previousepisode
         */
        public Links(Self self, Previousepisode previousepisode) {
            super();
            this.self = self;
            this.previousepisode = previousepisode;
        }

        public Self getSelf() {
            return self;
        }

        public void setSelf(Self self) {
            this.self = self;
        }

        public Previousepisode getPreviousepisode() {
            return previousepisode;
        }

        public void setPreviousepisode(Previousepisode previousepisode) {
            this.previousepisode = previousepisode;
        }

    }

    public class Network {

        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("country")
        @Expose
        private Country country;
        @SerializedName("officialSite")
        @Expose
        private String officialSite;

        /**
         * No args constructor for use in serialization
         */
        public Network() {
        }

        /**
         * @param country
         * @param name
         * @param id
         * @param officialSite
         */
        public Network(int id, String name, Country country, String officialSite) {
            super();
            this.id = id;
            this.name = name;
            this.country = country;
            this.officialSite = officialSite;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public String getOfficialSite() {
            return officialSite;
        }

        public void setOfficialSite(String officialSite) {
            this.officialSite = officialSite;
        }

    }

    public class Previousepisode {

        @SerializedName("href")
        @Expose
        private String href;

        /**
         * No args constructor for use in serialization
         */
        public Previousepisode() {
        }

        /**
         * @param href
         */
        public Previousepisode(String href) {
            super();
            this.href = href;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Rating {

        @SerializedName("average")
        @Expose
        private float average;

        /**
         * No args constructor for use in serialization
         */
        public Rating() {
        }

        /**
         * @param average
         */
        public Rating(float average) {
            super();
            this.average = average;
        }

        public float getAverage() {
            return average;
        }

        public void setAverage(float average) {
            this.average = average;
        }

    }

    public class Schedule {

        @SerializedName("time")
        @Expose
        private String time;
        @SerializedName("days")
        @Expose
        private List<String> days = null;

        /**
         * No args constructor for use in serialization
         */
        public Schedule() {
        }

        /**
         * @param days
         * @param time
         */
        public Schedule(String time, List<String> days) {
            super();
            this.time = time;
            this.days = days;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public List<String> getDays() {
            return days;
        }

        public void setDays(List<String> days) {
            this.days = days;
        }

    }

    public class Self {

        @SerializedName("href")
        @Expose
        private String href;

        /**
         * No args constructor for use in serialization
         */
        public Self() {
        }

        /**
         * @param href
         */
        public Self(String href) {
            super();
            this.href = href;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    //endregion

}
