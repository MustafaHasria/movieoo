package com.newhorizon.movieoo.view.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.newhorizon.movieoo.R;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieAdapterViewHolder> {

    //region Variables
    List<ShowMoviesResponse> movieModelList;
    Context context;
    //endregion

    //region Constructor

    public MovieAdapter(List<ShowMoviesResponse> movieModelList) {
        this.movieModelList = movieModelList;
    }

    //endregion

    //region Adapter
    @NonNull
    @Override
    public MovieAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item_movie, viewGroup, false);
        context = viewGroup.getContext();
        return new MovieAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapterViewHolder offerAdapterViewHolder, int i) {
        offerAdapterViewHolder.movieListItemTextName.setText(movieModelList.get(i).getName());
        Glide.with(context).applyDefaultRequestOptions(new RequestOptions()
                        .placeholder(R.drawable.ic_loading).error(R.drawable.ic_error))
                .load(movieModelList.get(i).getImage().getMedium())
                .into(offerAdapterViewHolder.recyclerItemMovieImageView);

    }

    @Override
    public int getItemCount() {
        return movieModelList.size();
    }

    public void updateList(List<ShowMoviesResponse> showMoviesResponses) {
        this.movieModelList = showMoviesResponses;
        notifyDataSetChanged();
    }
    //endregion

    //region View holder
    class MovieAdapterViewHolder extends RecyclerView.ViewHolder {

        //region Components
        CardView movieListItemCardMainContainer;
        TextView movieListItemTextName;
        ImageView recyclerItemMovieImageView;
        //endregion

        public MovieAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            movieListItemCardMainContainer = itemView.findViewById(R.id.movie_list_item_card_main_container);
            movieListItemTextName = itemView.findViewById(R.id.movie_list_item_text_name);
            recyclerItemMovieImageView = itemView.findViewById(R.id.recycler_item_movie_image_view);
        }
    }
    //endregion
}
