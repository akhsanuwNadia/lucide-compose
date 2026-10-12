package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookUser") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,13.0f)
                curveTo(15.004807f,11.925007f,14.434065f,10.929609f,13.503886f,10.39072f)
                curveTo(12.573709f,9.851831f,11.426291f,9.851831f,10.496114f,10.39072f)
                curveTo(9.565935f,10.929609f,8.995193f,11.925007f,9.0f,13.0f)
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
                moveTo(10.0f,8.0f)
                curveTo(9.996795f,8.716661f,10.377291f,9.38026f,10.997409f,9.73952f)
                curveTo(11.617528f,10.098779f,12.382472f,10.098779f,13.002591f,9.73952f)
                curveTo(13.622709f,9.38026f,14.003205f,8.716661f,14.0f,8.0f)
                curveTo(14.003205f,7.283338f,13.622709f,6.6197395f,13.002591f,6.2604804f)
                curveTo(12.382472f,5.901221f,11.617528f,5.901221f,10.997409f,6.2604804f)
                curveTo(10.377291f,6.6197395f,9.996795f,7.283338f,10.0f,8.0f)
            }
}

public val LucideIcons.All.BookUserDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookUser: ImageVector
    @Composable get() = BookUserDefinition.asImageVector()
