package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LocateOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,19.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.889999389648438,13.239999771118164)
                curveTo(19.296459197998047,10.98337173461914,18.57196044921875,8.670747756958008,16.950605392456055,7.049393653869629)
                curveTo(15.329251289367676,5.42803955078125,13.016627311706543,4.703540325164795,10.75999927520752,5.109999656677246)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(5.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.050000190734863,7.050000190734863)
                curveTo(4.337018966674805,9.78735637664795,4.3468918800354,14.202716827392578,7.07208776473999,16.927913665771484)
                curveTo(9.797284126281738,19.653108596801758,14.212644577026367,19.662982940673828,16.950000762939453,16.950000762939453)
            }
}

public val LucideIcons.All.LocateOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LocateOff: ImageVector
    @Composable get() = LocateOffDefinition.asImageVector()
