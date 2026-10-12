package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Printer3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,11.0f)
                lineTo(10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,20.0f)
                lineTo(15.0f,17.0f)
                curveTo(15.0f,16.447716f,14.552285f,16.0f,14.0f,16.0f)
                lineTo(9.0f,16.0f)
                curveTo(8.447715f,16.0f,8.0f,16.447716f,8.0f,17.0f)
                lineTo(8.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,20.0f)
                lineTo(20.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,22.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(18.0f,2.0f)
                curveTo(19.10457f,2.0f,20.0f,2.8954306f,20.0f,4.0f)
                lineTo(20.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,8.0f)
                lineTo(8.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.635f,10.093f)
                curveTo(8.229892f,9.714711f,7.9999366f,9.185269f,8.0f,8.631f)
                lineTo(8.0f,7.0f)
                curveTo(8.0f,6.4477153f,8.447715f,6.0f,9.0f,6.0f)
                lineTo(11.0f,6.0f)
                curveTo(11.552285f,6.0f,12.0f,6.4477153f,12.0f,7.0f)
                lineTo(12.0f,9.0f)
                curveTo(11.999943f,9.265195f,11.894549f,9.519507f,11.707f,9.707f)
                lineTo(10.707f,10.707f)
                curveTo(10.3165f,11.097382f,9.683499f,11.097382f,9.292999f,10.707f)
                close()
            }
}

public val LucideIcons.All.Printer3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Printer3d: ImageVector
    @Composable get() = Printer3dDefinition.asImageVector()
