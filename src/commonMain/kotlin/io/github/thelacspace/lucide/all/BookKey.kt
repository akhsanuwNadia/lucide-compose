package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,2.0f)
                lineTo(6.5f,2.0f)
                curveTo(5.119288f,2.0f,4.0f,3.1192882f,4.0f,4.5f)
                lineTo(4.0f,19.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,2.0f)
                lineTo(17.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,4.0f)
                lineTo(19.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,15.2f)
                lineTo(20.0f,21.0f)
                curveTo(20.0f,21.552284f,19.552284f,22.0f,19.0f,22.0f)
                lineTo(6.5f,22.0f)
                curveTo(5.1236525f,21.993845f,4.0111556f,20.876362f,4.0111556f,19.5f)
                curveTo(4.0111556f,18.123638f,5.1236525f,17.006155f,6.5f,17.0f)
                lineTo(20.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,10.0f)
                curveTo(14.996795f,10.716661f,15.377291f,11.38026f,15.997409f,11.73952f)
                curveTo(16.617527f,12.098779f,17.382473f,12.098779f,18.00259f,11.73952f)
                curveTo(18.62271f,11.38026f,19.003204f,10.716661f,19.0f,10.0f)
                curveTo(19.003204f,9.283339f,18.62271f,8.61974f,18.00259f,8.26048f)
                curveTo(17.382473f,7.901221f,16.617527f,7.901221f,15.997409f,8.26048f)
                curveTo(15.377291f,8.61974f,14.996795f,9.283339f,15.0f,10.0f)
            }
}

public val LucideIcons.All.BookKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookKey: ImageVector
    @Composable get() = BookKeyDefinition.asImageVector()
