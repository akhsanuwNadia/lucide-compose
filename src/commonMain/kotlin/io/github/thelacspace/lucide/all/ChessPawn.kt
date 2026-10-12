package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessPawn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,20.0f)
                curveTo(5.0f,18.89543f,5.8954306f,18.0f,7.0f,18.0f)
                lineTo(17.0f,18.0f)
                curveTo(18.10457f,18.0f,19.0f,18.89543f,19.0f,20.0f)
                lineTo(19.0f,21.0f)
                curveTo(19.0f,21.552284f,18.552284f,22.0f,18.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(5.4477153f,22.0f,5.0f,21.552284f,5.0f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f,10.0f)
                lineTo(16.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.0f)
                lineTo(17.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,18.0f)
                lineTo(9.5f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                curveTo(7.99359f,7.433324f,8.7545805f,8.760521f,9.994819f,9.479039f)
                curveTo(11.235056f,10.197558f,12.764944f,10.197558f,14.005181f,9.479039f)
                curveTo(15.2454195f,8.760521f,16.00641f,7.433324f,16.0f,6.0f)
                curveTo(16.00641f,4.566676f,15.2454195f,3.239479f,14.005181f,2.5209603f)
                curveTo(12.764944f,1.8024417f,11.235056f,1.8024417f,9.994819f,2.5209603f)
                curveTo(8.7545805f,3.239479f,7.99359f,4.566676f,8.0f,6.0f)
            }
}

public val LucideIcons.All.ChessPawnDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessPawn: ImageVector
    @Composable get() = ChessPawnDefinition.asImageVector()
