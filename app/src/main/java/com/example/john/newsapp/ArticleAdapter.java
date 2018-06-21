package com.example.john.newsapp;

        import android.content.Context;
        import android.graphics.drawable.GradientDrawable;
        import android.support.annotation.NonNull;
        import android.support.v4.content.ContextCompat;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;
        import java.util.List;

public class ArticleAdapter extends ArrayAdapter<Article> {

    /**
     * Constructs a new {@link ArticleAdapter}.
     *
     * @param context  of the app
     * @param articles is the list of articles, which is the data source of the adapter
     */
    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    /**
     * Returns a list item view that displays information about the article at the given position
     * in the list of articles.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);

        // Find the article at the given position in the list of articles
        Article currentArticle = getItem(position);

        // Find the TextView with view ID sectio_Name
        TextView sectionNameView = (TextView) listItemView.findViewById(R.id.section_Name);
        assert currentArticle != null;
        sectionNameView.setText(currentArticle.getSectionName());

        // Find the TextView with view ID title
        TextView webTitleView = (TextView) listItemView.findViewById(R.id.title);
        webTitleView.setText(currentArticle.getWebTitle());

        // Find the TextView with view ID author_name
        TextView authorNameView = listItemView.findViewById(R.id.author_name);
        // Display the author name of the current news in that TextView
        if (currentArticle.getAuthorName() != "") {
            authorNameView.setText(currentArticle.getAuthorName());

            //Set author name view as visible
            authorNameView.setVisibility(View.VISIBLE);
        } else {
            //Set author name view as gone
            authorNameView.setVisibility(View.GONE);
        }

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Display the date when the article was published
        dateView.setText(currentArticle.getwebPublicationDate());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}