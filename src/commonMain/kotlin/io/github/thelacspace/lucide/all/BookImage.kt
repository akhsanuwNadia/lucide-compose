package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookImage") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,13.7f)
                lineTo(17.9f,11.6f)
                curveTo(17.122313f,10.837714f,15.8776865f,10.837714f,15.099999f,11.6f)
                lineTo(9.7f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,19.5f)
                lineTo(4.0f,4.5f)
                curveTo(4.0f,3.1192882f,5.119288f,2.0f,6.5f,2.0f)
                lineTo(19.0f,2.0f)
                curveTo(19.552284f,2.0f,20.0f,2.4477153f,20.0f,3.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.0f,21.552284f,19.552284f,22.0f,19.0f,22.0f)
                lineTo(6.5f,22.0f)
                curveTo(5.1236525f,21.993845f,4.0111556f,20.876362f,4.0111556f,19.5f)
                curveTo(4.0111556f,18.123638f,5.1236525f,17.006155f,6.5f,17.0f)
                lineTo(20.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,8.0f)
                curveTo(7.996795f,8.716661f,8.377291f,9.38026f,8.997409f,9.73952f)
                curveTo(9.617528f,10.098779f,10.382472f,10.098779f,11.002591f,9.73952f)
                curveTo(11.622709f,9.38026f,12.003205f,8.716661f,12.0f,8.0f)
                curveTo(12.003205f,7.283338f,11.622709f,6.6197395f,11.002591f,6.2604804f)
                curveTo(10.382472f,5.901221f,9.617528f,5.901221f,8.997409f,6.2604804f)
                curveTo(8.377291f,6.6197395f,7.996795f,7.283338f,8.0f,8.0f)
            }
}

public val LucideIcons.All.BookImageDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookImage: ImageVector
    @Composable get() = BookImageDefinition.asImageVector()
