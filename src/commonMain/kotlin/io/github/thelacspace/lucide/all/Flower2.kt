package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Flower2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,5.0f)
                curveTo(12.0f,3.3431458f,13.343145f,2.0f,15.0f,2.0f)
                curveTo(16.656855f,2.0f,18.0f,3.3431458f,18.0f,5.0f)
                curveTo(18.0f,6.656854f,16.656855f,8.0f,15.0f,8.0f)
                moveTo(12.0f,5.0f)
                curveTo(12.0f,3.3431458f,10.656855f,2.0f,9.0f,2.0f)
                curveTo(7.343146f,2.0f,6.0f,3.3431458f,6.0f,5.0f)
                curveTo(6.0f,6.656854f,7.343146f,8.0f,9.0f,8.0f)
                moveTo(12.0f,5.0f)
                lineTo(12.0f,6.0f)
                moveTo(9.0f,8.0f)
                curveTo(7.343146f,8.0f,6.0f,9.343145f,6.0f,11.0f)
                curveTo(6.0f,12.656855f,7.343146f,14.0f,9.0f,14.0f)
                curveTo(10.656855f,14.0f,12.0f,12.656855f,12.0f,11.0f)
                moveTo(9.0f,8.0f)
                lineTo(10.0f,8.0f)
                moveTo(15.0f,8.0f)
                curveTo(16.656855f,8.0f,18.0f,9.343145f,18.0f,11.0f)
                curveTo(18.0f,12.656855f,16.656855f,14.0f,15.0f,14.0f)
                curveTo(13.343145f,14.0f,12.0f,12.656855f,12.0f,11.0f)
                moveTo(15.0f,8.0f)
                lineTo(14.0f,8.0f)
                moveTo(12.0f,11.0f)
                lineTo(12.0f,10.0f)
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
            lucidePath(strokeWidth) {
                moveTo(12.0f,10.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                curveTo(16.2f,22.0f,19.0f,20.333f,19.0f,17.0f)
                curveTo(14.8f,17.0f,12.0f,18.667f,12.0f,22.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                curveTo(7.8f,22.0f,5.0f,20.333f,5.0f,17.0f)
                curveTo(9.2f,17.0f,12.0f,18.667f,12.0f,22.0f)
                close()
            }
}

public val LucideIcons.All.Flower2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Flower2: ImageVector
    @Composable get() = Flower2Definition.asImageVector()
