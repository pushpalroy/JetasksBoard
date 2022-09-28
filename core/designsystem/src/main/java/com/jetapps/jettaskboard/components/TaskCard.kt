package com.jetapps.jettaskboard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.jetapps.jettaskboard.model.CardModel

@Composable
fun TaskCard(
  modifier: Modifier = Modifier,
  onClick: () -> Unit,
  card: CardModel
) {
  Card(
    modifier = modifier
      .padding(4.dp)
      .fillMaxWidth()
      .clickable {
        onClick()
      },
    shape = RoundedCornerShape(10),
    backgroundColor = Color(0xFF2c2c2e)
  ) {
    Column(
      modifier = Modifier.padding(8.dp)
    ) {

      card.coverImageUrl?.let { safeCoverImageUrl ->
        if (safeCoverImageUrl.isNotEmpty()) {
          Image(
            painter = rememberAsyncImagePainter(safeCoverImageUrl),
            contentDescription = "Cover Image"
          )
          Spacer(modifier = Modifier.height(4.dp))
        }
      }

      card.labels.let { cardLabels ->
        Row(
          modifier = Modifier.fillMaxWidth(),
          horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
          for (label in cardLabels) {
            Box(
              modifier = Modifier
                .width(32.dp)
                .height(16.dp)
                .clip(RoundedCornerShape(10))
                .background(color = Color(label.labelColor))
            )
          }
        }
      }

      Spacer(modifier = Modifier.height(8.dp))

      Text(
        modifier = Modifier,
        text = card.title,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        style = TextStyle(
          fontSize = 10.sp
        )
      )
    }
  }
}