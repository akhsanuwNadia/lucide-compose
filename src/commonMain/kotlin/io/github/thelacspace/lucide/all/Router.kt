package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Router") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                lineTo(20.0f,14.0f)
                lineTo(22.0f,14.0f)
                lineTo(22.0f,22.0f)
                lineTo(20.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(2.0f,22.0f)
                lineTo(2.0f,14.0f)
                lineTo(4.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.01f,18.0f)
                lineTo(6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.01f,18.0f)
                lineTo(10.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,10.0f)
                lineTo(15.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.84f,7.17f)
                curveTo(17.089727f,6.418892f,16.071638f,5.9968534f,15.01f,5.9968534f)
                curveTo(13.948363f,5.9968534f,12.930273f,6.418892f,12.18f,7.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.66f,4.34f)
                curveTo(17.53623f,1.2182771f,12.473769f,1.2182771f,9.349999f,4.34f)
            }
}

public val LucideIcons.All.RouterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Router: ImageVector
    @Composable get() = RouterDefinition.asImageVector()
