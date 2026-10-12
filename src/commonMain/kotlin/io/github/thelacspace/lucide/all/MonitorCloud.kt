package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorCloud") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,13.0f)
                curveTo(9.474557f,12.9992f,8.192584f,11.853796f,8.020682f,10.338069f)
                curveTo(7.8487806f,8.822343f,8.841688f,7.4189396f,10.328209f,7.0765467f)
                curveTo(11.814731f,6.734154f,13.321519f,7.561798f,13.83f,9.0f)
                lineTo(14.0f,9.0f)
                curveTo(15.101078f,9.004924f,15.9910755f,9.8989105f,15.9910755f,11.0f)
                curveTo(15.9910755f,12.1010895f,15.101078f,12.995076f,14.0f,13.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(20.0f,3.0f)
                lineTo(22.0f,3.0f)
                lineTo(22.0f,17.0f)
                lineTo(20.0f,17.0f)
                lineTo(4.0f,17.0f)
                lineTo(2.0f,17.0f)
                lineTo(2.0f,3.0f)
                lineTo(4.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.MonitorCloudDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorCloud: ImageVector
    @Composable get() = MonitorCloudDefinition.asImageVector()
