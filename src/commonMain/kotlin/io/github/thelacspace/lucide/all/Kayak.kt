package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Kayak") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,17.0f)
                curveTo(17.447716f,17.0f,17.0f,17.447716f,17.0f,18.0f)
                lineTo(17.0f,19.0f)
                curveTo(17.0f,20.10457f,17.89543f,21.0f,19.0f,21.0f)
                curveTo(20.10457f,21.0f,21.0f,20.10457f,21.0f,19.0f)
                curveTo(21.0f,17.89543f,20.10457f,17.0f,19.0f,17.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.97f,3.61f)
                curveTo(21.032509f,3.4445486f,20.992302f,3.257823f,20.867239f,3.13276f)
                curveTo(20.742176f,3.007697f,20.55545f,2.967491f,20.39f,3.03f)
                curveTo(10.2f,6.6f,6.6f,10.2f,3.03f,20.39f)
                curveTo(2.967491f,20.55545f,3.007697f,20.742176f,3.13276f,20.867239f)
                curveTo(3.257823f,20.992302f,3.4445486f,21.032509f,3.61f,20.97f)
                curveTo(13.8f,17.4f,17.4f,13.8f,20.97f,3.61f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.707f,6.707f)
                lineTo(17.293f,17.293f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,5.0f)
                curveTo(7.0f,3.8954306f,6.1045694f,3.0f,5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                curveTo(3.0f,6.1045694f,3.8954306f,7.0f,5.0f,7.0f)
                lineTo(6.0f,7.0f)
                curveTo(6.5522847f,7.0f,7.0f,6.5522847f,7.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.KayakDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Kayak: ImageVector
    @Composable get() = KayakDefinition.asImageVector()
