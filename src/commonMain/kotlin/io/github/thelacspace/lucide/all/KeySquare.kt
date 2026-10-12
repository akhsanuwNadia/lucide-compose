package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("KeySquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.4f,2.7f)
                curveTo(13.358883f,1.8107073f,14.841116f,1.8107073f,15.799999f,2.7f)
                lineTo(21.3f,8.2f)
                curveTo(22.189293f,9.158883f,22.189293f,10.641117f,21.3f,11.6f)
                lineTo(17.599998f,15.3f)
                curveTo(16.641115f,16.189293f,15.158882f,16.189293f,14.199999f,15.3f)
                lineTo(8.7f,9.8f)
                curveTo(7.8107066f,8.841117f,7.8107066f,7.358883f,8.7f,6.4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,7.0f)
                lineTo(17.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.4f,10.6f)
                lineTo(2.5859995f,17.414001f)
                curveTo(2.2109015f,17.788986f,2.0001137f,18.297611f,2.0f,18.828f)
                lineTo(2.0f,21.0f)
                curveTo(2.0f,21.552284f,2.4477153f,22.0f,3.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(6.5522847f,22.0f,7.0f,21.552284f,7.0f,21.0f)
                lineTo(7.0f,20.0f)
                curveTo(7.0f,19.447716f,7.4477153f,19.0f,8.0f,19.0f)
                lineTo(9.0f,19.0f)
                curveTo(9.552285f,19.0f,10.0f,18.552284f,10.0f,18.0f)
                lineTo(10.0f,17.0f)
                curveTo(10.0f,16.447716f,10.447715f,16.0f,11.0f,16.0f)
                lineTo(11.172f,16.0f)
                curveTo(11.70239f,15.9998865f,12.211015f,15.789099f,12.586f,15.414f)
                lineTo(13.400001f,14.599999f)
            }
}

public val LucideIcons.All.KeySquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.KeySquare: ImageVector
    @Composable get() = KeySquareDefinition.asImageVector()
