package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockArrowLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,12.0)
                lineTo(13.5,12.800000190734863)
            }
            lucidePath(strokeWidth) {
                moveTo(12.338000297546387,21.993999481201172)
                curveTo(8.152652740478516,22.13529396057129,4.3225483894348145,19.65375328063965,2.7410836219787598,15.776116371154785)
                curveTo(1.159618854522705,11.898480415344238,2.1617894172668457,7.446132183074951,5.252175807952881,4.620073318481445)
                curveTo(8.342562675476074,1.7940151691436768,12.866540908813477,1.1928786039352417,16.58769989013672,3.113833427429199)
                curveTo(20.308860778808594,5.034788608551025,22.438962936401367,9.070926666259766,21.924999237060547,13.226999282836914)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,18.0)
                lineTo(22.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,22.0)
                lineTo(14.0,18.0)
                lineTo(18.0,14.0)
            }
}

public val LucideIcons.All.ClockArrowLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockArrowLeft: ImageVector
    @Composable get() = ClockArrowLeftDefinition.asImageVector()
