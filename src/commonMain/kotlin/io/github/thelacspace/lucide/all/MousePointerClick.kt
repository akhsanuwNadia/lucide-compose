package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointerClick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,4.099999904632568)
                lineTo(12.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.099999904632568,8.0)
                lineTo(2.1999998092651367,7.199999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(4.099999904632568,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.199999809265137,2.200000047683716)
                lineTo(8.0,5.099999904632568)
            }
            lucidePath(strokeWidth) {
                moveTo(9.036999702453613,9.6899995803833)
                curveTo(8.957674980163574,9.503130912780762,8.999720573425293,9.28681755065918,9.143268585205078,9.143268585205078)
                curveTo(9.28681755065918,8.999720573425293,9.503130912780762,8.957674980163574,9.6899995803833,9.036999702453613)
                lineTo(20.689998626708984,13.536999702453613)
                curveTo(20.89086151123047,13.619400024414062,21.015594482421875,13.822007179260254,20.998716354370117,14.038457870483398)
                curveTo(20.98183822631836,14.254907608032227,20.827205657958984,14.435730934143066,20.615999221801758,14.486000061035156)
                lineTo(16.266998291015625,15.527000427246094)
                curveTo(15.900914192199707,15.614442825317383,15.614935874938965,15.90003490447998,15.526998519897461,16.266000747680664)
                lineTo(14.486998558044434,20.61600112915039)
                curveTo(14.437265396118164,20.827953338623047,14.25610065460205,20.98336410522461,14.03904914855957,21.00027084350586)
                curveTo(13.821996688842773,21.01717758178711,13.618952751159668,20.891695022583008,13.536998748779297,20.690000534057617)
                close()
            }
}

public val LucideIcons.All.MousePointerClickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointerClick: ImageVector
    @Composable get() = MousePointerClickDefinition.asImageVector()
