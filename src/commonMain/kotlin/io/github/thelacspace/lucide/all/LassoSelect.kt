package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LassoSelect") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,22.0f)
                curveTo(5.7409706f,21.055729f,5.0f,19.573786f,5.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,16.93f)
                curveTo(7.96f,17.36f,8.96f,17.67f,9.99f,17.84f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.34f,14.0f)
                curveTo(2.4805932f,12.842431f,2.0113385f,11.441671f,2.0f,10.0f)
                curveTo(2.0f,5.58f,6.48f,2.0f,12.0f,2.0f)
                curveTo(17.52f,2.0f,22.0f,5.58f,22.0f,10.0f)
                curveTo(21.984999f,10.6789055f,21.873896f,11.3522625f,21.67f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,18.0f)
                curveTo(5.716662f,18.003204f,6.3802605f,17.62271f,6.7395196f,17.00259f)
                curveTo(7.098779f,16.382473f,7.098779f,15.617528f,6.7395196f,14.997409f)
                curveTo(6.3802605f,14.377291f,5.716662f,13.996795f,5.0f,14.0f)
                curveTo(3.8989217f,14.004924f,3.0089242f,14.8989105f,3.0089242f,16.0f)
                curveTo(3.0089242f,17.10109f,3.8989217f,17.995075f,5.0f,18.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.33f,22.0f)
                lineTo(14.24f,22.0f)
                curveTo(14.100924f,21.954058f,14.005163f,21.826376f,14.0f,21.68f)
                lineTo(14.0f,11.68f)
                curveTo(13.99992f,11.49606f,14.146139f,11.34541f,14.33f,11.34f)
                curveTo(14.41f,11.34f,14.48f,11.37f,14.54f,11.42f)
                lineTo(21.880001f,17.42f)
                curveTo(21.992002f,17.50748f,22.035418f,17.65684f,21.987762f,17.790728f)
                curveTo(21.940107f,17.924616f,21.812088f,18.012957f,21.670002f,18.01f)
                lineTo(17.180002f,18.01f)
                lineTo(14.6100025f,21.86f)
                curveTo(14.543903f,21.948132f,14.440167f,22.0f,14.330003f,22.0f)
                close()
            }
}

public val LucideIcons.All.LassoSelectDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LassoSelect: ImageVector
    @Composable get() = LassoSelectDefinition.asImageVector()
