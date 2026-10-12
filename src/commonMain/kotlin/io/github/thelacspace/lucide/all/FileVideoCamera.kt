package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileVideoCamera") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.640058f,1.9984303f,15.254227f,2.2525938f,15.706f,2.7059999f)
                lineTo(19.294f,6.2939997f)
                curveTo(19.747406f,6.7457733f,20.00157f,7.359942f,20.0f,8.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,17.843f)
                lineTo(13.033f,16.088001f)
                curveTo(13.232316f,15.969495f,13.480142f,15.96807f,13.680807f,16.084278f)
                curveTo(13.881473f,16.200485f,14.003583f,16.416143f,14.0f,16.648f)
                lineTo(14.0f,21.352001f)
                curveTo(13.997377f,21.581247f,13.87418f,21.792158f,13.675785f,21.907051f)
                curveTo(13.477389f,22.021944f,13.233141f,22.023825f,13.033f,21.912f)
                lineTo(10.0f,20.157f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,16.0f)
                lineTo(9.0f,16.0f)
                lineTo(10.0f,16.0f)
                lineTo(10.0f,22.0f)
                lineTo(9.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(3.0f,22.0f)
                lineTo(3.0f,16.0f)
                lineTo(4.0f,16.0f)
                close()
            }
}

public val LucideIcons.All.FileVideoCameraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileVideoCamera: ImageVector
    @Composable get() = FileVideoCameraDefinition.asImageVector()
