package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileStack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,21.0f)
                curveTo(11.0f,21.552284f,10.552285f,22.0f,10.0f,22.0f)
                lineTo(4.0f,22.0f)
                curveTo(3.4477153f,22.0f,3.0f,21.552284f,3.0f,21.0f)
                lineTo(3.0f,13.0f)
                curveTo(3.0f,12.447715f,3.4477153f,12.0f,4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                curveTo(16.0f,16.552284f,15.552285f,17.0f,15.0f,17.0f)
                lineTo(9.0f,17.0f)
                curveTo(8.447715f,17.0f,8.0f,16.552284f,8.0f,16.0f)
                lineTo(8.0f,8.0f)
                curveTo(8.0f,7.4477153f,8.447715f,7.0f,9.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,6.0f)
                curveTo(20.999887f,5.46961f,20.789099f,4.960985f,20.414f,4.586f)
                lineTo(18.414f,2.586f)
                curveTo(18.039015f,2.2109013f,17.53039f,2.0001135f,17.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(13.447715f,2.0f,13.0f,2.4477153f,13.0f,3.0f)
                lineTo(13.0f,11.0f)
                curveTo(13.0f,11.552285f,13.447715f,12.0f,14.0f,12.0f)
                lineTo(20.0f,12.0f)
                curveTo(20.552284f,12.0f,21.0f,11.552285f,21.0f,11.0f)
                close()
            }
}

public val LucideIcons.All.FileStackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileStack: ImageVector
    @Composable get() = FileStackDefinition.asImageVector()
