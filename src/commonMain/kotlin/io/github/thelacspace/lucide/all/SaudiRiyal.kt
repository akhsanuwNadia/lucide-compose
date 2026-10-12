package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SaudiRiyal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,19.5)
                lineTo(14.5,20.700000762939453)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5,4.0)
                lineTo(14.5,15.220000267028809)
                curveTo(14.50008487701416,15.527790069580078,14.641902923583984,15.81839370727539,14.884478569030762,16.007844924926758)
                curveTo(15.127054214477539,16.197296142578125,15.443358421325684,16.26448631286621,15.741999626159668,16.190000534057617)
                lineTo(20.0,15.199999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(2.9779999256134033,19.35099983215332)
                lineTo(8.526999473571777,17.987998962402344)
                curveTo(9.418168067932129,17.744997024536133,10.026993751525879,16.923311233520508,10.0,16.0)
                lineTo(10.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,10.0)
                lineTo(4.0,13.5)
            }
}

public val LucideIcons.All.SaudiRiyalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SaudiRiyal: ImageVector
    @Composable get() = SaudiRiyalDefinition.asImageVector()
