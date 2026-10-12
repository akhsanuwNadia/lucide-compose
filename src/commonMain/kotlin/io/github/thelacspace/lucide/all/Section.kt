package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Section") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,5.0)
                curveTo(15.990151405334473,3.3483827114105225,14.202178001403809,2.0133864879608154,12.0,2.0133864879608154)
                curveTo(9.797821998596191,2.0133864879608154,8.009848594665527,3.3483827114105225,8.0,5.0)
                curveTo(8.0,9.0,16.0,8.0,16.0,12.0)
                curveTo(15.990151405334473,13.651617050170898,14.202178001403809,14.986613273620605,12.0,14.986613273620605)
                curveTo(9.797821998596191,14.986613273620605,8.009848594665527,13.651617050170898,8.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,19.0)
                curveTo(8.009848594665527,20.6516170501709,9.797821998596191,21.986614227294922,12.0,21.986614227294922)
                curveTo(14.202178001403809,21.986614227294922,15.990151405334473,20.6516170501709,16.0,19.0)
                curveTo(16.0,15.0,8.0,16.0,8.0,12.0)
                curveTo(8.009848594665527,10.348382949829102,9.797821998596191,9.013386726379395,12.0,9.013386726379395)
                curveTo(14.202178001403809,9.013386726379395,15.990151405334473,10.348382949829102,16.0,12.0)
            }
}

public val LucideIcons.All.SectionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Section: ImageVector
    @Composable get() = SectionDefinition.asImageVector()
