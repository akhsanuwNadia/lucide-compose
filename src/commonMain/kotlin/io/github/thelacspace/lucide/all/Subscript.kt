package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Subscript") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,5.0)
                lineTo(12.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,5.0)
                lineTo(4.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,19.0)
                lineTo(16.0,19.0)
                curveTo(16.0,17.5,16.440000534057617,17.0,17.5,16.5)
                curveTo(18.559999465942383,16.0,20.0,15.329999923706055,20.0,14.0)
                curveTo(20.0,13.529999732971191,19.829999923706055,13.069999694824219,19.520000457763672,12.710000038146973)
                curveTo(18.86020851135254,11.962928771972656,17.76763916015625,11.779444694519043,16.900001525878906,12.270000457763672)
                curveTo(16.48000144958496,12.510000228881836,16.160001754760742,12.890000343322754,16.000001907348633,13.34000015258789)
            }
}

public val LucideIcons.All.SubscriptDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Subscript: ImageVector
    @Composable get() = SubscriptDefinition.asImageVector()
