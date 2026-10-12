package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Binoculars") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,10.0f)
                lineTo(14.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,7.0f)
                lineTo(19.0f,4.0f)
                curveTo(19.0f,3.4477153f,18.552284f,3.0f,18.0f,3.0f)
                lineTo(16.0f,3.0f)
                curveTo(15.447715f,3.0f,15.0f,3.4477153f,15.0f,4.0f)
                lineTo(15.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,21.0f)
                curveTo(21.10457f,21.0f,22.0f,20.10457f,22.0f,19.0f)
                lineTo(22.0f,15.149f)
                curveTo(22.0f,13.759f,20.0f,12.187f,20.0f,10.32f)
                lineTo(20.0f,8.0f)
                curveTo(20.0f,7.4477153f,19.552284f,7.0f,19.0f,7.0f)
                lineTo(15.0f,7.0f)
                curveTo(14.447715f,7.0f,14.0f,7.4477153f,14.0f,8.0f)
                lineTo(14.0f,19.0f)
                curveTo(14.0f,20.10457f,14.895431f,21.0f,16.0f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,16.0f)
                lineTo(2.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,21.0f)
                curveTo(2.8954306f,21.0f,2.0f,20.10457f,2.0f,19.0f)
                lineTo(2.0f,15.149f)
                curveTo(2.0f,13.759f,4.0f,12.187f,4.0f,10.32f)
                lineTo(4.0f,8.0f)
                curveTo(4.0f,7.4477153f,4.4477153f,7.0f,5.0f,7.0f)
                lineTo(9.0f,7.0f)
                curveTo(9.552285f,7.0f,10.0f,7.4477153f,10.0f,8.0f)
                lineTo(10.0f,19.0f)
                curveTo(10.0f,20.10457f,9.104569f,21.0f,8.0f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,7.0f)
                lineTo(9.0f,4.0f)
                curveTo(9.0f,3.4477153f,8.552285f,3.0f,8.0f,3.0f)
                lineTo(6.0f,3.0f)
                curveTo(5.4477153f,3.0f,5.0f,3.4477153f,5.0f,4.0f)
                lineTo(5.0f,7.0f)
            }
}

public val LucideIcons.All.BinocularsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Binoculars: ImageVector
    @Composable get() = BinocularsDefinition.asImageVector()
