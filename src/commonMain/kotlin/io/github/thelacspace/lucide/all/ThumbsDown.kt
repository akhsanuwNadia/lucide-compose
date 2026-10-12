package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ThumbsDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,18.12f)
                lineTo(10.0f,14.0f)
                lineTo(4.17f,14.0f)
                curveTo(3.5404856f,14.0f,2.947709f,13.703611f,2.5700004f,13.2f)
                curveTo(2.1922915f,12.696388f,2.0737362f,12.044334f,2.25f,11.440001f)
                lineTo(4.58f,3.4400005f)
                curveTo(4.8288884f,2.586667f,5.611111f,2.0f,6.5f,2.0f)
                lineTo(20.0f,2.0f)
                curveTo(21.10457f,2.0f,22.0f,2.8954306f,22.0f,4.0f)
                lineTo(22.0f,12.0f)
                curveTo(22.0f,13.104569f,21.10457f,14.0f,20.0f,14.0f)
                lineTo(17.24f,14.0f)
                curveTo(16.481056f,14.000402f,15.78773f,14.430342f,15.45f,15.11f)
                lineTo(12.0f,22.0f)
                curveTo(11.044645f,21.98817f,10.147011f,21.540642f,9.562595f,20.784796f)
                curveTo(8.97818f,20.028952f,8.77099f,19.047575f,9.0f,18.119999f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,14.0f)
                lineTo(17.0f,2.0f)
            }
}

public val LucideIcons.All.ThumbsDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ThumbsDown: ImageVector
    @Composable get() = ThumbsDownDefinition.asImageVector()
