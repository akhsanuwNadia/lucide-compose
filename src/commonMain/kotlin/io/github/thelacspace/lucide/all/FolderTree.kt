package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderTree") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,10.0f)
                curveTo(20.552284f,10.0f,21.0f,9.552285f,21.0f,9.0f)
                lineTo(21.0f,6.0f)
                curveTo(21.0f,5.4477153f,20.552284f,5.0f,20.0f,5.0f)
                lineTo(17.5f,5.0f)
                curveTo(17.185244f,4.9999995f,16.888855f,4.8518057f,16.7f,4.6f)
                lineTo(15.800001f,3.3999999f)
                curveTo(15.611147f,3.1481938f,15.314757f,2.9999995f,15.0f,3.0f)
                lineTo(13.0f,3.0f)
                curveTo(12.447715f,3.0f,12.0f,3.4477153f,12.0f,4.0f)
                lineTo(12.0f,9.0f)
                curveTo(12.0f,9.552285f,12.447715f,10.0f,13.0f,10.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,21.0f)
                curveTo(20.552284f,21.0f,21.0f,20.552284f,21.0f,20.0f)
                lineTo(21.0f,17.0f)
                curveTo(21.0f,16.447716f,20.552284f,16.0f,20.0f,16.0f)
                lineTo(17.1f,16.0f)
                curveTo(16.72705f,15.995124f,16.38781f,15.783098f,16.220001f,15.45f)
                lineTo(15.800001f,14.599999f)
                curveTo(15.640449f,14.23441f,15.278888f,13.9986105f,14.880001f,13.999999f)
                lineTo(13.0f,13.999999f)
                curveTo(12.447715f,13.999999f,12.0f,14.447714f,12.0f,14.999999f)
                lineTo(12.0f,20.0f)
                curveTo(12.0f,20.552284f,12.447715f,21.0f,13.0f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                curveTo(3.0f,6.1045694f,3.8954306f,7.0f,5.0f,7.0f)
                lineTo(8.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(3.0f,16.0f)
                curveTo(3.0f,17.10457f,3.8954306f,18.0f,5.0f,18.0f)
                lineTo(8.0f,18.0f)
            }
}

public val LucideIcons.All.FolderTreeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderTree: ImageVector
    @Composable get() = FolderTreeDefinition.asImageVector()
