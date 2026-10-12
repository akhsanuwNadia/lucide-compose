package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileHeadphone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,6.835000038146973)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                lineTo(14.0,2.0)
                curveTo(14.640057563781738,1.9984302520751953,15.254226684570312,2.252593755722046,15.706000328063965,2.7059998512268066)
                lineTo(19.29400062561035,6.293999671936035)
                curveTo(19.747406005859375,6.7457733154296875,20.001569747924805,7.3599419593811035,20.0,8.0)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                lineTo(17.656999588012695,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,19.0)
                curveTo(2.0049242973327637,17.898921966552734,2.8989107608795166,17.00892448425293,4.0,17.00892448425293)
                curveTo(5.101089000701904,17.00892448425293,5.995075702667236,17.898921966552734,6.0,19.0)
                lineTo(6.0,20.0)
                curveTo(5.995075702667236,21.101078033447266,5.101089000701904,21.99107551574707,4.0,21.99107551574707)
                curveTo(2.8989107608795166,21.99107551574707,2.0049242973327637,21.101078033447266,2.0,20.0)
                lineTo(2.0,16.0)
                curveTo(2.014772653579712,12.696765899658203,4.696732521057129,10.026772499084473,8.0,10.026772499084473)
                curveTo(11.303267478942871,10.026772499084473,13.985227584838867,12.696765899658203,14.0,16.0)
                lineTo(14.0,20.0)
                curveTo(13.995076179504395,21.101078033447266,13.101089477539062,21.99107551574707,12.0,21.99107551574707)
                curveTo(10.898910522460938,21.99107551574707,10.004923820495605,21.101078033447266,10.0,20.0)
                lineTo(10.0,19.0)
                curveTo(10.004923820495605,17.898921966552734,10.898910522460938,17.00892448425293,12.0,17.00892448425293)
                curveTo(13.101089477539062,17.00892448425293,13.995076179504395,17.898921966552734,14.0,19.0)
            }
}

public val LucideIcons.All.FileHeadphoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileHeadphone: ImageVector
    @Composable get() = FileHeadphoneDefinition.asImageVector()
