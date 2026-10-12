package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Turtle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,10.0f)
                lineTo(14.0f,14.0f)
                lineTo(14.0f,17.0f)
                curveTo(14.0f,17.552284f,14.447715f,18.0f,15.0f,18.0f)
                lineTo(17.0f,18.0f)
                curveTo(17.552284f,18.0f,18.0f,17.552284f,18.0f,17.0f)
                lineTo(18.0f,14.0f)
                curveTo(18.01282f,11.133352f,16.490839f,8.478958f,14.010364f,7.0419207f)
                curveTo(11.529888f,5.6048837f,8.470112f,5.6048837f,5.9896364f,7.0419207f)
                curveTo(3.5091612f,8.478958f,1.9871799f,11.133352f,2.0f,14.0f)
                lineTo(2.0f,17.0f)
                curveTo(2.0f,17.552284f,2.4477153f,18.0f,3.0f,18.0f)
                lineTo(5.0f,18.0f)
                curveTo(5.5522847f,18.0f,6.0f,17.552284f,6.0f,17.0f)
                lineTo(6.0f,14.0f)
                lineTo(8.0f,10.0f)
                lineTo(12.0f,10.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.82f,7.9f)
                lineTo(8.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.18f,7.9f)
                lineTo(12.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.93f,10.0f)
                lineTo(20.0f,10.0f)
                curveTo(21.101078f,10.004924f,21.991076f,10.8989105f,21.991076f,12.0f)
                curveTo(21.991076f,13.1010895f,21.101078f,13.995076f,20.0f,14.0f)
                lineTo(2.0f,14.0f)
            }
}

public val LucideIcons.All.TurtleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Turtle: ImageVector
    @Composable get() = TurtleDefinition.asImageVector()
