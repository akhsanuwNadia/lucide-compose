package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cuboid") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,22.0)
                lineTo(10.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.3359999656677246,8.890000343322754)
                lineTo(10.0,14.0)
                lineTo(21.71500015258789,6.9710001945495605)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,14.0)
                curveTo(22.0000057220459,14.702528953552246,21.631410598754883,15.353549003601074,21.02899932861328,15.71500015258789)
                lineTo(11.028999328613281,21.71500015258789)
                curveTo(10.3665132522583,22.112751007080078,9.534167289733887,22.093286514282227,8.890998840332031,21.665000915527344)
                lineTo(2.8909988403320312,17.665000915527344)
                curveTo(2.334183931350708,17.293983459472656,1.9997878074645996,16.66910171508789,2.0,16.0)
                lineTo(2.0,10.0)
                curveTo(1.9999932050704956,9.297471046447754,2.3685879707336426,8.646450996398926,2.9709999561309814,8.28499984741211)
                lineTo(12.970999717712402,2.2849998474121094)
                curveTo(13.633485794067383,1.8872495889663696,14.465831756591797,1.9067151546478271,15.108999252319336,2.3349997997283936)
                lineTo(21.108999252319336,6.335000038146973)
                curveTo(21.665815353393555,6.706016540527344,22.000211715698242,7.330898761749268,22.0,8.0)
                close()
            }
}

public val LucideIcons.All.CuboidDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cuboid: ImageVector
    @Composable get() = CuboidDefinition.asImageVector()
