package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Strikethrough") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,4.0)
                lineTo(9.0,4.0)
                curveTo(8.02581787109375,3.9994893074035645,7.112044334411621,4.4720377922058105,6.549391269683838,5.267306804656982)
                curveTo(5.986738681793213,6.062575817108154,5.845272541046143,7.0815324783325195,6.170000076293945,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,12.0)
                curveTo(16.20215606689453,12.009848594665527,17.98215103149414,13.797821998596191,17.98215103149414,16.0)
                curveTo(17.98215103149414,18.202178955078125,16.20215606689453,19.99015235900879,14.0,20.0)
                lineTo(6.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(20.0,12.0)
            }
}

public val LucideIcons.All.StrikethroughDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Strikethrough: ImageVector
    @Composable get() = StrikethroughDefinition.asImageVector()
