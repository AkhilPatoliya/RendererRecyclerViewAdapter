package com.github.vivchar.example.pages.github.items.fork;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.vivchar.example.R;

/**
 * Created by Vivchar Vitaly on 1/10/17.
 */
public class ForkViewHolder extends RecyclerView.ViewHolder {

	public final TextView name;
	public final ImageView avatar;

	public ForkViewHolder(final View itemView) {
		super(itemView);
		avatar = (ImageView) itemView.findViewById(R.id.fork_avatar);
		name = (TextView) itemView.findViewById(R.id.fork_name);
	}
}
