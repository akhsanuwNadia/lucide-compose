package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareScissors") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,17.0)
                lineTo(14.819999694824219,14.819999694824219)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5600004196167,14.4399995803833)
                lineTo(17.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5600004196167,9.5600004196167)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,15.5)
                curveTo(6.997596263885498,16.03749656677246,7.282967567443848,16.535194396972656,7.748056888580322,16.80463981628418)
                curveTo(8.213146209716797,17.074085235595703,8.786853790283203,17.074085235595703,9.251943588256836,16.80463981628418)
                curveTo(9.717032432556152,16.535194396972656,10.00240421295166,16.03749656677246,10.0,15.5)
                curveTo(10.00240421295166,14.962503433227539,9.717032432556152,14.464804649353027,9.251943588256836,14.19536018371582)
                curveTo(8.786853790283203,13.925915718078613,8.213146209716797,13.925915718078613,7.748056888580322,14.19536018371582)
                curveTo(7.282967567443848,14.464804649353027,6.997596263885498,14.962503433227539,7.0,15.5)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,8.5)
                curveTo(6.997596263885498,9.037496566772461,7.282967567443848,9.535195350646973,7.748056888580322,9.80463981628418)
                curveTo(8.213146209716797,10.074084281921387,8.786853790283203,10.074084281921387,9.251943588256836,9.80463981628418)
                curveTo(9.717032432556152,9.535195350646973,10.00240421295166,9.037496566772461,10.0,8.5)
                curveTo(10.00240421295166,7.962503433227539,9.717032432556152,7.464804649353027,9.251943588256836,7.19536018371582)
                curveTo(8.786853790283203,6.925915718078613,8.213146209716797,6.925915718078613,7.748056888580322,7.19536018371582)
                curveTo(7.282967567443848,7.464804649353027,6.997596263885498,7.962503433227539,7.0,8.5)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
}

public val LucideIcons.All.SquareScissorsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareScissors: ImageVector
    @Composable get() = SquareScissorsDefinition.asImageVector()
