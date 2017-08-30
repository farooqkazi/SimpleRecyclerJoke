package com.example.kazi.jokesrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class JokeListAdapter extends RecyclerView.Adapter<JokeListAdapter.JokeViewHolder> {

    JokeList jokeList;
    public JokeListAdapter(JokeList jokeList) {
        this.jokeList = jokeList;
    }

    @Override
    public JokeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Use the layout context made for displaying jokes
        //Inflate this row

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);
                //Resource, view group root, false

        return new JokeViewHolder(v);
    }

    /**
     * Set the content of the given holder view/s using the position
     */
    @Override
    public void onBindViewHolder(JokeViewHolder holder, int position) {
        holder.joke.setText(jokeList.getJokes().get(position));
    }

    @Override
    public int getItemCount() {
        return jokeList.getJokes().size();
    }

    /**
     * Each Adapter has a View Holder to catch view references
     * The Adapter uses these references to bind each view to it's content
     *
     * Each item in the RecyclerView has an associated view holder instance
     * that catches the view ref for that item.
     */
    public class JokeViewHolder extends RecyclerView.ViewHolder{

        /**
         * In this case, The JokeList JokeViewHolder holds refs to the TextView
         * of an associated row item laid out in a CardView.
         */

        TextView joke;

        public JokeViewHolder(View itemView) {
            super(itemView);

            //Locate and Cache View Refs
            joke = itemView.findViewById(R.id.jokeHaha);
        }
    }

}