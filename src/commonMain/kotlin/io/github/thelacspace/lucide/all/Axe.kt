package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Axe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,12.0)
                lineTo(5.619000434875488,20.380001068115234)
                curveTo(4.789497375488281,21.202392578125,3.4512858390808105,21.199623107910156,2.6251935958862305,20.37380599975586)
                curveTo(1.7991015911102295,19.547988891601562,1.7958862781524658,18.20977783203125,2.6180005073547363,17.380001068115234)
                lineTo(11.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,15.5)
                curveTo(15.0,15.776142120361328,15.223857879638672,16.0,15.5,16.0)
                curveTo(19.08985137939453,16.0,22.0,13.089850425720215,22.0,9.5)
                curveTo(22.0,9.223857879638672,21.776142120361328,9.0,21.5,9.0)
                lineTo(19.827999114990234,9.0)
                curveTo(19.297609329223633,8.999886512756348,18.788984298706055,8.789098739624023,18.413999557495117,8.413999557495117)
                lineTo(13.351999282836914,3.3519997596740723)
                curveTo(12.881431579589844,2.881502628326416,12.118566513061523,2.881502628326416,11.647998809814453,3.3519997596740723)
                lineTo(9.35200023651123,5.6479997634887695)
                curveTo(8.881503105163574,6.118566989898682,8.881503105163574,6.88143253326416,9.35200023651123,7.351999759674072)
                lineTo(14.413999557495117,12.413999557495117)
                curveTo(14.789098739624023,12.788985252380371,14.999886512756348,13.29761028289795,15.0,13.82800006866455)
                close()
            }
}

public val LucideIcons.All.AxeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Axe: ImageVector
    @Composable get() = AxeDefinition.asImageVector()
