package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bold") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(15.0,12.0)
                curveTo(17.20215606689453,12.009848594665527,18.98215103149414,13.797821998596191,18.98215103149414,16.0)
                curveTo(18.98215103149414,18.202178955078125,17.20215606689453,19.99015235900879,15.0,20.0)
                lineTo(7.0,20.0)
                curveTo(6.4477152824401855,20.0,6.0,19.552284240722656,6.0,19.0)
                lineTo(6.0,5.0)
                curveTo(6.0,4.4477152824401855,6.4477152824401855,4.0,7.0,4.0)
                lineTo(14.0,4.0)
                curveTo(16.20215606689453,4.009848594665527,17.98215103149414,5.797821521759033,17.98215103149414,8.0)
                curveTo(17.98215103149414,10.202178001403809,16.20215606689453,11.990151405334473,14.0,12.0)
            }
}

public val LucideIcons.All.BoldDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bold: ImageVector
    @Composable get() = BoldDefinition.asImageVector()
