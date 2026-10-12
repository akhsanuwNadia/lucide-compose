package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CakeSlice") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,13.0f)
                lineTo(3.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,17.0f)
                lineTo(3.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.2f,7.9f)
                lineTo(3.8119998f,10.4f)
                curveTo(3.3010373f,10.777284f,2.99966f,11.374843f,3.0f,12.01f)
                lineTo(3.0f,20.0f)
                curveTo(3.0f,20.552284f,3.4477153f,21.0f,4.0f,21.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.552284f,21.0f,21.0f,20.552284f,21.0f,20.0f)
                lineTo(21.0f,11.346f)
                curveTo(21.0f,9.346f,18.56f,5.3199997f,14.559999f,3.3199997f)
                curveTo(14.219396f,3.125034f,13.796234f,3.1473262f,13.478f,3.3769996f)
                lineTo(10.4f,5.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,7.0f)
                curveTo(6.996795f,7.716662f,7.3772902f,8.38026f,7.9974093f,8.73952f)
                curveTo(8.617528f,9.098779f,9.382472f,9.098779f,10.002591f,8.73952f)
                curveTo(10.622709f,8.38026f,11.003205f,7.716662f,11.0f,7.0f)
                curveTo(11.003205f,6.283338f,10.622709f,5.6197395f,10.002591f,5.2604804f)
                curveTo(9.382472f,4.901221f,8.617528f,4.901221f,7.9974093f,5.2604804f)
                curveTo(7.3772902f,5.6197395f,6.996795f,6.283338f,7.0f,7.0f)
            }
}

public val LucideIcons.All.CakeSliceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CakeSlice: ImageVector
    @Composable get() = CakeSliceDefinition.asImageVector()
